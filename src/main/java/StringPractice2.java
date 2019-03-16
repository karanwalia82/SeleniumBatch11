public class StringPractice2 {

    private String input = "     Atin          #          M    #    Mississauga    #   Java";

    public static void main(String[] args) {

        String input = "     Atin          #          M    #    Mississauga    #   Java";
        String [] data =  input.split("#");
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i].trim().toUpperCase());
        }

    }

    public String[] getIndividualString(){

        return this.input.split("#");
    }

}
