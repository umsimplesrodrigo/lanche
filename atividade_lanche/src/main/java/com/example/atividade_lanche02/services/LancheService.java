package com.example.atividade_lanche02.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import com.example.atividade_lanche02.entities.Lanche;
import org.springframework.stereotype.Service;

@Service
public class LancheService {
    private String filePath = "C:\\Users\\aluno.fsa\\ImagensLancheDestino\\"; //algo não está certo aqui ...

    public Lanche getById(int id) {
        return null;
    }

    public boolean exists(int id) {
        return true;
    }

    private String getFileExtension(Path path) {
        String filename = path.getFileName().toString();
        int lastDotIndex = filename.lastIndexOf('.');

        if (lastDotIndex == -1 || lastDotIndex == filename.length() - 1) {
            return "";
        }

        return filename.substring(lastDotIndex + 1);
    }

    public boolean save(Lanche lanche) {
        Path path = Paths.get(lanche.getImgUrl());

        Path destinationPath = Paths.get(String.format("%s%d.%s", filePath, lanche.getId(), getFileExtension(path)));

        if (Files.exists(path)) {
            try {
                Files.copy(path, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                lanche.setImgUrl(destinationPath.toString());
                return true;
            } catch (IOException e) {
                return false;
            }
        }

        return false;
    }

    public boolean delete(Lanche Lanche) {
        Path path = Paths.get(Lanche.getImgUrl());

        if (Files.exists(path)) {
            try {
                Files.delete(path);
                return true;
            } catch (IOException e) {
                return false;
            }
        }

        return false;
    }
}
