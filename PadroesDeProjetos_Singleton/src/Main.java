public class Main {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }

    private static void bookSeat(String seat){
        AirCraft airCraft = AirCraft.getInstance();

        boolean success = airCraft.BookSeat(seat);
        if(success){
            System.out.println("Assento " + seat + " reservado com sucesso");

        }else{
            System.out.printf("Assento " + seat  + " assento ocupado");
        }

    }

}