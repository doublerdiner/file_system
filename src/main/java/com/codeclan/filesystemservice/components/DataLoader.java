package com.codeclan.filesystemservice.components;

import com.codeclan.filesystemservice.models.ExtensionType;
import com.codeclan.filesystemservice.models.File;
import com.codeclan.filesystemservice.models.Folder;
import com.codeclan.filesystemservice.models.User;
import com.codeclan.filesystemservice.repositories.FileRepository;
import com.codeclan.filesystemservice.repositories.FolderRepository;
import com.codeclan.filesystemservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private FolderRepository folderRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {
        User user1 = new User("Chris");
        User user2 = new User("Aimi");
        User user3 = new User("Jim");
        User user4 = new User("Kim");
        User user5 = new User("Gus");
        Folder folder1 = new Folder("Artwork", user2);
        Folder folder2 = new Folder("Pictures", user2);
        Folder folder3 = new Folder("Codeclan", user1);
        Folder folder4 = new Folder("Sailing", user5);
        Folder folder5 = new Folder("Games", user4);
        File file1 = new File("Picture of Jim", ExtensionType.TXT, 100, folder2);
        File file2 = new File("Picture of Chris", ExtensionType.TXT, 120, folder2);
        File file3 = new File("CCHomework", ExtensionType.JAVA, 30, folder3);
        File file4 = new File("Accounts", ExtensionType.TXT, 30, folder4);
        File file5 = new File("Tetris", ExtensionType.RB, 50, folder5);
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);
        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);
        folderRepository.save(folder4);
        folderRepository.save(folder5);
        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);
        fileRepository.save(file4);
        fileRepository.save(file5);
    }
}
