package com.javarush.task.task36.task3608.model;

public interface Model {
    ModelData getModelData();
    void loadDeletedUsers();
    void loadUsers();
    void loadUserById(long userId);
    void deleteUserById(long id);
}
