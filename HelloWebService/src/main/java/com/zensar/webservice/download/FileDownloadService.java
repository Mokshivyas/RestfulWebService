package com.zensar.webservice.download;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class FileDownloadService {

		private static final String textFile = "D:/SILOpenFontLicense.txt";
		
		@GET
		@Path("/text")
		@Produces("text/plain")
		public Response getTextFile() {
			File f = new File(textFile);
			ResponseBuilder builder = Response.ok(f);
			builder.header("Content-Disposition", "attachment;filename=newlicense.txt");
			return builder.build();
		}
		
		
		private static final String imageFile = "D:/c1.jpg";
		@GET
		@Path("/image")
		@Produces("image/jpg")
		public Response getImageFile() {
			File f = new File(imageFile);
			ResponseBuilder builder = Response.ok(f);
			builder.header("Content-Disposition", "attachment;filename=newimage.jpg");
			return builder.build();
		}
		
		
		private static final String pdfFile = "D:/sample.pdf";
		@GET
		@Path("/pdf")
		@Produces("application/pdf")
		public Response getPdfFile() {
			File f = new File(pdfFile);
			ResponseBuilder builder = Response.ok(f);
			builder.header("Content-Disposition", "attachment;filename=newpdf.pdf");
			return builder.build();
		}
}
