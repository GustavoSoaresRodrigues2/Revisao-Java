package Parte09_JavaAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * =========================================================
 * 📘 TEMA: API de Data e Hora (java.time)
 * =========================================================
 *
 * 🔎 1) Classes principais:
 * - LocalDate: data (ano, mês, dia)
 * - LocalTime: hora (hora, minuto, segundo, nanos)
 * - LocalDateTime: data + hora
 * - Period: diferença entre datas em anos, meses, dias
 * - Duration: diferença entre tempos em horas, minutos, segundos
 *
 * 🔎 2) Observações:
 * - java.time é imutável e seguro para multithreading
 * - Use DateTimeFormatter para formatar datas e horas
 *
 * =========================================================
 */
public class ExDateTime {

    public static void main(String[] args) {

        // ======================
        // 1. LocalDate
        // ======================
        LocalDate hoje = LocalDate.now();
        System.out.println("Data atual: " + hoje);

        LocalDate aniversario = LocalDate.of(1995, Month.MARCH, 2);
        System.out.println("Aniversário: " + aniversario);

        // ======================
        // 2. LocalTime
        // ======================
        LocalTime agora = LocalTime.now();
        System.out.println("Hora atual: " + agora);

        LocalTime horaEspecifica = LocalTime.of(14, 30, 15);
        System.out.println("Hora específica: " + horaEspecifica);

        // ======================
        // 3. LocalDateTime
        // ======================
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println("Data e hora atual: " + agoraCompleto);

        LocalDateTime evento = LocalDateTime.of(2026, Month.MARCH, 2, 18, 45);
        System.out.println("Evento: " + evento);

        // ======================
        // 4. Period (diferença entre datas)
        // ======================
        Period idade = Period.between(aniversario, hoje);
        System.out.println("\nDiferença entre aniversário e hoje:");
        System.out.println(idade.getYears() + " anos, " + idade.getMonths() + " meses, " + idade.getDays() + " dias");

        // ======================
        // 5. Duration (diferença entre tempos)
        // ======================
        LocalTime inicio = LocalTime.of(9, 0, 0);
        LocalTime fim = LocalTime.of(17, 30, 0);
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("\nDuração do expediente: " + duracao.toHours() + " horas e " + (duracao.toMinutes() % 60) + " minutos");

        // ======================
        // 6. Formatação de datas e horas
        // ======================
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("\nData formatada: " + hoje.format(formatoData));
        System.out.println("Hora formatada: " + agora.format(formatoHora));

        // ======================
        // 7. Observações / boas práticas
        // ======================
        // ✅ Use LocalDate/LocalTime/LocalDateTime ao invés de java.util.Date
        // ✅ Use Period para datas e Duration para horas
        // ✅ DateTimeFormatter permite formatação customizada
        // ❌ Não use métodos de java.util.Calendar/Date antigos se possível
    }
}