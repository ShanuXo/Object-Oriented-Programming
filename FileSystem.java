import java.util.ArrayList;

abstract class FileSystemItem  {
    //we haeve name 
    protected String fileName;
    public FileSystemItem(String fileName){
        this.fileName = fileName;
    } 
    public abstract int getSize();
    public abstract void display();   
}

//file should able to show the size 
// display the info of file   File ---> name + size +kb;
class File extends FileSystemItem{
    int size;
    public File(String fileName,int size)
    {
        super(fileName);
        this.size = size;
    }
    //Return size of file
    public int getSize(){
        return size;
    }
    public void display()
    {
        System.out.println("File --->" + fileName +"--"+ size + ".kb");
    }
}

class Directory {
    String name;
    ArrayList<File> listOfFile;
    public Directory(String name)
    {
        this.name=name;
        listOfFile=new ArrayList<>();
    }
   
   public void addFile(File file){
    listOfFile.add(file);
   }
   public void display(){
    for(File name :listOfFile){
        System.out.print(name+" ");
    }
   }
    
}

class FileSystem{
    public static void main(String[] args)
    {
        File file=new File("xyz",40);
        File file1=new File("xyz",40);
        File file2=new File("xyz",40);
        File file3=new File("xyz",40);
        file.display();
        Directory dir=new Directory("Shanu");
        dir.addFile(file);
        dir.addFile(file1);
        dir.addFile(file2);
        dir.addFile(file3);
        dir.display();
    }
}

//File file = new File("XYZ",23);
//Directpry  dir = new Directry("main");
// dir.addFile(file);

