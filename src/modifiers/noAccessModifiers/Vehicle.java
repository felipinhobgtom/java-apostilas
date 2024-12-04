package modifiers.noAccessModifiers;

/* final */ class Vehicle {
    protected String marca = "Ford";
    public void honk(){
        System.out.println("Vrum vrum");

        // dá pau pq é final, não deixa ser herdado
    }
}

class Main extends Vehicle{
        private String name = "Mustang";
        public static void main(String[] args){
            Main carro = new Main();

            System.out.println(carro.marca);
            System.out.println(carro.name);
            carro.honk();
        }
}