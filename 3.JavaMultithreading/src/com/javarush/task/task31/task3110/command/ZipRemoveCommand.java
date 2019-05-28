package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;
import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Укажите удаляемый файл:");
            Path deleteFile = Paths.get(ConsoleHelper.readString());

            zipFileManager.removeFile(deleteFile);

        } catch (PathIsNotFoundException ignore) {
        }
    }
}
