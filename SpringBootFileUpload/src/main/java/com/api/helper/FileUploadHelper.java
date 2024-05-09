package com.api.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	//public final String UPLOAD_DIR = "C:\\Users\\Acer\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\SpringBootFileUpload\\src\\main\\resources\\static\\image";
	public final String UPLOAD_DIR = new ClassPathResource("static/image/").getFile().getAbsolutePath();
	
	public FileUploadHelper() throws IOException{
		
	}
	
	public boolean uploadFile(MultipartFile file) {
		
		boolean uploadFlag = false;
		
		try {
			
			Files.copy(file.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			uploadFlag = true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		return uploadFlag;
		
	}
	
}
