import java.util.Scanner;

// Project: The Shadow of Alhambral
// Description: An interactive text game exploring the Palace of Granada.
// Author: Taha Idra
// Version: 0.1
// This code represents only the first chapter of the game. More chapters, events, and choices will be added later.

public class Alhambral {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("تُحيط بك أجواء غرناطة المُثقلة بالهموم. ليلةٌ حالكة السواد، والسماء ملبدةٌ بالغيوم. تقفُ أمام أسوار قصر الحمراء الشامخة، آخر معاقل المُسلمين في الأندلس. تُخيّمُ على المكانِ هيبةُ التاريخ، وصوتُ الريحِ يُعانقُ أنينَ المدينةِ المُحاصرة. تسمعُ أصواتًا خافتةً من داخل القصر، خليطٌ من الدعواتِ والهمساتِ وقرقعةِ السلاح.\n\n");

        System.out.println("ماذا تفعل؟");
        System.out.println("1. الدخول من البوابة الرئيسية");
        System.out.println("2. التسلل من البوابة الخلفية");
        System.out.println("3. التنصت على الحراس");

        int choice1 = scanner.nextInt();
        scanner.nextLine(); // استهلاك السطر الجديد بعد قراءة الرقم

        switch (choice1) {
            case 1:
                System.out.println("\nتتقدمُ بخطواتٍ ثابتةٍ نحو البوابةِ الرئيسيةِ. يلمحُكَ الحراسُ المُتمركزون هناك، فيُوجهون إليكَ أسلحتهم. يسألكَ أحدُهم بصوتٍ جهور: 'من أنتَ وماذا تُريدُ في هذا الوقتِ المُتأخر؟'\n\n");
                System.out.println("ماذا تُجيب؟");
                System.out.println("أ. أنا رسولٌ من الملكِ أبي عبد الله");
                System.out.println("ب. أنا من أهلِ المدينةِ وأبحثُ عن ملجأ");
                System.out.println("ج. لا تُجيبُ وتحاولُ الهرب");

                String choice1a = scanner.nextLine();

                switch (choice1a) {
                    case "أ":
                        System.out.println("يشكُّ الحراسُ في أمركَ ويُطالبونَكَ بإثباتٍ على كلامك. (سيتم إضافة المزيد لاحقاً)");
                        break;
                    case "ب":
                        System.out.println("يتعاطفُ معكَ بعضُ الحراسِ ويسمحونَ لكَ بالدخولِ إلى ساحةِ القصرِ الداخليةِ، لكنكَ تحتَ المراقبةِ المُشددة. (سيتم إضافة المزيد لاحقاً)");
                        break;
                    case "ج":
                        System.out.println("يُطلقُ الحراسُ النارَ عليكَ، وتُصابُ إصابةً طفيفةً، لكنكَ تتمكنُ من الهربِ والاختباءِ. (سيتم إضافة المزيد لاحقاً)");
                        break;
                    default:
                        System.out.println("خيار غير صحيح.");
                        break;
                }
                break;
            case 2:
                System.out.println("\nتتجهُ بحذرٍ نحو الجانبِ الخلفيِّ للقصرِ. تجدُ بوابةً صغيرةً يبدو أنها أقلَّ حراسة. تُحاولُ فتحها، فتجدُها مُغلقة.\n\n");
                System.out.println("ماذا تفعل؟");
                System.out.println("أ. تسلق الجدار");
                System.out.println("ب. البحث عن طريقة أخرى لفتح البوابة");

                String choice2a = scanner.nextLine();

                switch (choice2a) {
                    case "أ":
                        System.out.println("تتمكنُ من تسلقِ الجدارِ بصعوبةٍ وتدخلُ إلى حديقةِ القصرِ الخلفية. (سيتم إضافة المزيد لاحقاً)");
                        break;
                    case "ب":
                        System.out.println("تجدُ حجرًا صغيرًا بالقربِ من البوابةِ، فتستخدمه لكسرِ قفلِ البوابةِ وتدخلُ بحذر. (سيتم إضافة المزيد لاحقاً)");
                        break;
                    default:
                        System.out.println("خيار غير صحيح.");
                        break;
                }
                break;
            case 3:
                System.out.println("\nتختبئُ خلفَ شجرةٍ بالقربِ من البوابةِ الرئيسيةِ وتبدأُ بالتنصتِ على حديثِ الحراس. تتضحُ لكَ من حديثهم حالةُ التوترِ والقلقِ التي تُسيطرُ على القصر. يتحدثون عن قربِ سقوطِ المدينةِ وأنَّ الملكَ يُفكرُ في الاستسلام.\n\n");
                System.out.println("ماذا تفعل بعد التنصت؟");
                System.out.println("أ. الدخول من البوابة الرئيسية (بعد معرفة بعض المعلومات)");
                System.out.println("ب. التسلل من البوابة الخلفية (بعد معرفة بعض المعلومات)");

                String choice3a = scanner.nextLine();

                switch (choice3a) {
                    case "أ":
                        System.out.println("تُقررُ الآنَ الدخولَ من البوابةِ الرئيسيةِ بعدَ أنْ جمعتَ بعضَ المعلومات. (سيتم إضافة المزيد لاحقاً - قد يعود هذا إلى الخيارات السابقة مع معلومات إضافية)");
                        break;
                    case "ب":
                        System.out.println("تُفضلُ التسللَ من البوابةِ الخلفيةِ لتجنبِ المواجهةِ المُباشرة. (سيتم إضافة المزيد لاحقاً - قد يعود هذا إلى الخيارات السابقة مع معلومات إضافية)");
                        break;
                    default:
                        System.out.println("خيار غير صحيح.");
                        break;
                }
                break;
            default:
                System.out.println("خيار غير صحيح.");
                break;
        }
        scanner.close();
    }
}
