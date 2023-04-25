package com.codeclan.filesystemservice;

import com.codeclan.filesystemservice.models.ExtensionType;
import com.codeclan.filesystemservice.models.File;
import com.codeclan.filesystemservice.models.Folder;
import com.codeclan.filesystemservice.models.User;
import com.codeclan.filesystemservice.repositories.FileRepository;
import com.codeclan.filesystemservice.repositories.FolderRepository;
import com.codeclan.filesystemservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesystemserviceApplicationTests {

	@Autowired
	UserRepository userRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void userCanBeAdded(){
		User user = new User("Chris");
		userRepository.save(user);
	}

	@Test
	public void folderCanBeAdded(){
		User user = new User("Aimi");
		userRepository.save(user);
		Folder folder = new Folder("Art", user);
		folderRepository.save(folder);
	}

	@Test
	public void fileCanBeAdded(){
		User user = new User("Daniel");
		Folder folder = new Folder("Pictures", user);
		File file = new File("Pic of Bobo", ExtensionType.TXT, 100, folder);
		userRepository.save(user);
		folderRepository.save(folder);
		fileRepository.save(file);
	}

}
