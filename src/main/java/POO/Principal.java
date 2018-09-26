package POO;

public class Principal {
    public static void main(String[] args) {
        Telefone t1 = new Telefone(48,"123456789", "Khomp",10,new Dimensao(10,1,2));
        System.out.println(t1.toString());
        t1.ola();
        System.out.println();
        Semfio s1 = new Semfio(10,"12345555","digitro",15,new Dimensao(10,10,10), 7,450000,14);
        System.out.println(s1.toString());
    }
}
