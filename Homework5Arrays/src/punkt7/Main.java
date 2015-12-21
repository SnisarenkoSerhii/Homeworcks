package punkt7;

/**
 * Created by Sergey on 22.10.2015.
 * В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает
 * в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма
 * первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
 * Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много
 * сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 */
public class Main {
    public static void main(String[] args) {
        int count = -1;
        for (int numeral1 = 0; numeral1 < 10; numeral1++)
            for (int numeral2 = 0; numeral2 < 10; numeral2++)
                for (int numeral3 = 0; numeral3 < 10; numeral3++)
                    for (int numeral4 = 0; numeral4 < 10; numeral4++)
                        for (int numeral5 = 0; numeral5 < 10; numeral5++)
                            for (int numeral6 = 0; numeral6 < 10; numeral6++)
                                if (numeral1 + numeral2 + numeral3 == numeral4 + numeral5 + numeral6) {
                                    count++;
                                }
        System.out.print(count);
    }
}
