class ImageUpload{
    void fileSize(String fileName,String fileExt,int size){
        System.out.println(fileExt);
    }
}

class CloudinaryUpload extends MediaUpload{
     void fileSize(String fileName,String fileExt){
        System.out.println("FILE DETAILS : ");
        // System.out.println("file Size "+size);
        System.out.println("File extension"+fileExt);
        System.out.println("file name"+fileName);

    }
}



public class Imp {
    public static void main(String[] args) {
        CloudinaryUpload file=new CloudinaryUpload();
        file.fileSize("sample.png", "png");
    }
}
