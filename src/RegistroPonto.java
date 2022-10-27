import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void apresentarRegistroPonto() {
        System.out.println("===========================");
        System.out.println("Funcionário: " + func.getNome());
        System.out.println(("Data de Registro: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataRegistro)));
        if (horaEntrada != null) {
        System.out.println("Horário Entrada: " + DateTimeFormatter.ofPattern("HH:mm").format(horaEntrada));
        }
        if (horaSaida != null) {
        System.out.println("Horário Saída: " + DateTimeFormatter.ofPattern("HH:mm").format(horaSaida));
        }
    }
}
