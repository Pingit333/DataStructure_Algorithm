package BigO;
class MainNew {
  
  private static String[] name = new String[]{"himanshu"};
  private static void printArray(String[] name){
    for(int i=0; i < name.length ; i++){ 
      System.out.println(name[i]);
    }
  }
  public static void main(String[] args) {
    printArray(name);
  }
}