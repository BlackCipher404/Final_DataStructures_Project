package App;
public class Patient {
    public int id;
    public String name;
    public String urgency; // حالة طوارئ أم عادية

    public Patient(int id, String name, String urgency) {
        this.id = id; this.name = name; this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "رقم: " + id + " | الاسم: " + name + " | الحالة: " + urgency;
    }

}