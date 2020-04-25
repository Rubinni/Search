public class stor {

    public static void main(String [] args){

        String str = "We have a large inventory of things in our warehouse falling in "+
                "the categories: apperal and the slightly"
                + "more in demand categories: makeup along with the categories: furniture"
                + " and ..." ;

        printString(str);

    }

    public static void printString(String string){

        int i = 0;

        while (true){
            int found = string.indexOf("categories:", i);
            if(found == -1) break;
            int start = found + 12;
            int end   = string.indexOf(" ",start);
            System.out.println(string.substring(start,end));
            i = end + 1;
        }

    }

}
