public interface Moeda {
    String getSimbolo();
}

    class Real implements Moeda{

        @Override
        public String getSimbolo(){
            return "RS";

    }
}

    class Dolar implements Moeda{
        @Override
        public String getSimbolo(){
            return "S";
        }
    }


