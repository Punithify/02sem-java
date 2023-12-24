
class MediaUpload{
    void fileSize(String fileName,String fileExt){
        System.out.println(fileExt);
    }
    void fileSize(String fileName,String fileExt,int size){
        System.out.println(size);
    }
}

class Cms{
    public static void main(String[] args) {
        MediaUpload file=new MediaUpload();
        file.fileSize("sample.png",".png",12);
    }
}