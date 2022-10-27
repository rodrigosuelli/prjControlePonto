import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        Gerente g = new Gerente();
        g.setIdFunc(1);
        g.setNome("John");
        g.setEmail("john@mail.com");
        g.setDocumento("rg");
        g.setLogin("john");
        g.setSenha("123");

        Secretaria s = new Secretaria();
        s.setIdFunc(2);
        s.setNome("Maria");
        s.setEmail("maria@mail.com");
        s.setDocumento("rg");

        s.setTelefone("199999999");
        s.setRamal("2862");

        Operador o = new Operador();
        o.setIdFunc(3);
        o.setNome("Jeff");
        o.setEmail("jeff@mail.com");
        o.setDocumento("rg");

        o.setValorHora(100);

        // Registros
        // Entrada Gerente
        Thread.sleep(1000);
        RegistroPonto r1 = new RegistroPonto();
        r1.setIdRegPonto(1);
        r1.setFunc(g);
        r1.setDataRegistro(LocalDate.parse("2022-10-27"));
        r1.setHoraEntrada(LocalDateTime.parse("2022-10-27T11:20:00"));
        r1.setHoraSaida(null);
        r1.apresentarRegistroPonto();

        // Entrada Operador
        Thread.sleep(1000);
        RegistroPonto r2 = new RegistroPonto();
        r2.setIdRegPonto(2);
        r2.setFunc(o);
        r2.setDataRegistro(LocalDate.parse("2022-10-27"));
        r2.setHoraEntrada(LocalDateTime.parse("2022-10-27T09:20:00"));
        r2.setHoraSaida(null);
        r2.apresentarRegistroPonto();

        // Entrada Secretaria
        Thread.sleep(1000);
        RegistroPonto r3 = new RegistroPonto();
        r3.setIdRegPonto(3);
        r3.setFunc(s);
        r3.setDataRegistro(LocalDate.parse("2022-10-27"));
        r3.setHoraEntrada(LocalDateTime.parse("2022-10-27T08:20:00"));
        r3.setHoraSaida(null);
        r3.apresentarRegistroPonto();

        // Saída Gerente
        Thread.sleep(1000);
        RegistroPonto r4 = new RegistroPonto();
        r4.setIdRegPonto(4);
        r4.setFunc(g);
        r4.setDataRegistro(LocalDate.parse("2022-10-27"));
        r4.setHoraSaida(LocalDateTime.parse("2022-10-27T17:20:00"));
        r4.apresentarRegistroPonto();
    }
}