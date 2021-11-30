
public class ControleFuncionarios {


    public static void main(String[] args) {
        
        Gerente g;
        g = new Gerente();
        g.setNome("Katarina du couteau");
        g.setCpf("123456");
        g.setEmail("katarinaducouteau@gmail.com");
        g.setComissao(15000);
        
        Estagiario e;
        e = new Estagiario();
        e.setNome("Caitlyn Kiramanm");
        e.setCpf("654321");
        e.setEmail("cupcakedavi@gmail.com");
        e.setTempoContrato(2);
        
        Estagiario est;
        est = new Estagiario(2, "Vi", "123654", "hotcupcake@gmail.com");
        
        Gerente grt;
        grt = new Gerente(12000, "Jinx", "321456", "jinxy@gmail.com");
        
        Funcionario f;
        f = new Funcionario();
        f.setNome("Ekko");
        f.setCpf("456789");
        f.setEmail("rodatempo@gmail.com");
        
        System.out.println("Gerente:" + g.getNome());
        System.out.println("Estagiária:" + e.getNome()); 
        System.out.println("Outra Estagiária:" + est.getNome());
        System.out.println("Outra Gerente:" + grt.getNome());
        System.out.println("Funcionario:" + f.getNome());

    }
    
}
