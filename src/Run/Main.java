package Run;
import App.Patient;
import Structures.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= نظام إدارة المستشفى المتكامل =======");

        // 1. استخدام المصفوفات (Arrays) للأقسام
        String[] departments = {"الطوارئ", "الأشعة", "الصيدلية"};
        System.out.print("أقسام المستشفى: ");
        for(String dept : departments) System.out.print(dept + " | ");
        System.out.println();

        // 2. استخدام الطابور (Queue) المخصص لاستقبال المرضى
        MyCustomQueue<Patient> receptionQueue = new MyCustomQueue<>();
        receptionQueue.enqueue(new Patient(1, "أحمد علي", "حالة عادية"));
        receptionQueue.enqueue(new Patient(2, "سارة محمود", "حالة طارئة"));

        // 3. استخدام المكدس (Stack) لتسجيل آخر الإجراءات
        Stack<String> recentActions = new Stack<>();
        recentActions.push("الطبيب فحص المريض رقم 1");
        recentActions.push("تم نقل المريض رقم 2 إلى قسم الأشعة");

        // معالجة البيانات وعرضها
        System.out.println("\n--- جاري معالجة طابور الاستقبال ---");
        while (!receptionQueue.isEmpty()) {
            System.out.println("يتم الآن فحص: " + receptionQueue.dequeue());
        }

        System.out.println("\n--- آخر إجراء مسجل في النظام ---");
        System.out.println(recentActions.peek());

        System.out.println("\n✅ جاهزية النظام مكتملة!");
    }
}