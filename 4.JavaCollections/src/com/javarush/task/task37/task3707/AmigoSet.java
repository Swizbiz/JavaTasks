package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet implements Set, Serializable, Cloneable {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        this.map = new HashMap<>(Math.max(16, (int) (collection.size() / .75f) + 1));
        for (E e : collection) {
            this.map.put(e, PRESENT);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        // Read in any hidden serialization magic
        objectInputStream.defaultReadObject();

        //Read capacity, load factor and size
        int capacity = objectInputStream.readInt();
        float loadFactor = objectInputStream.readFloat();
        int size = objectInputStream.readInt();

        // Create backing HashMap
        map = new HashMap<E, Object>(capacity, loadFactor);

        // Read in all elements in the proper order.
        for (int i = 0; i < size; i++) {
            E e = (E) objectInputStream.readObject();
            map.put(e, PRESENT);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AmigoSet)) return false;
        if (!super.equals(o)) return false;
        AmigoSet<?> amigoSet = (AmigoSet<?>) o;
        return Objects.equals(map, amigoSet.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), map);
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        // Write out any hidden serialization magic
        stream.defaultWriteObject();

        // Write out HashMap capacity, load factor and size
        int capacity = HashMapReflectionHelper.callHiddenMethod(map, "capacity");
        stream.writeInt(capacity);
        float loadFactor = HashMapReflectionHelper.callHiddenMethod(map, "loadFactor");
        stream.writeFloat(loadFactor);
        stream.writeInt(map.size());

        // Write out all elements in the proper order.
        for (E e : map.keySet())
            stream.writeObject(e);

    }

    @Override
    public boolean add(Object o) {
        return null == map.put((E) o, PRESENT);
    }

    @Override
    public boolean remove(Object o) {
        return null == map.remove(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Object clone() {
        try {
            AmigoSet clone = (AmigoSet) super.clone();
            clone.map = (HashMap) map.clone();
            return clone;
        } catch (Exception e) {
            throw new InternalError();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }
}
