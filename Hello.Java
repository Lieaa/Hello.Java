





public class Html {

        public static void main(String[] args) {
            
                        String html =  "<div><h1> This is Jadas page </h1><p> Hello, my name is Jada. I am new to computer science.
                        I am currently a preschool teacher." + "html page</p></div>";
            
                        File f = new File("C:\\Hello.Java.html");
                        try {
                        BufferedWriter bw = new Bufferedwriter(new FileWriter(f));
                        bw.write(html);
                        bw.close();
                            
                        }
                        catch (IOException e ){ //TODO Auto generated catch block
                            e.printStackTrace();
                        }
                }
            }
        
