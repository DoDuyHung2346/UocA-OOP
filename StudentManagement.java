public class StudentManagement {
    private Student students[] = new Student[100];
    private int size=0;
    public static boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    }
    public void addStudent(Student newStudent){
        if (size < 100) {
            students[size] = new Student(newStudent);
            size++;
        }
    }
    public String studentsByGroup()
    {
        int idx=0;
        String s[]=new String[100];
        if(students[0]!=null)s[0]=students[0].getGroup();
        for(int i=1;i<100;i++)
        {
            if(students[i]!=null && !students[i].getGroup().equals(s[idx])){
                idx++;
                s[idx]=students[i].getGroup();
            }
        }
        String xau="";
        for(int i=0;i<=idx;i++)
        {
            xau=xau+s[i]+"\n";
            for(int j=0;j<size;j++) {
                if (students[j] != null && students[j].getGroup().equals(s[i])) {
                    xau = xau + students[j].getName() + " - " + students[j].getId() + " - " + students[j].getGroup() + " - " + students[j].getEmail()+"\n";
                }
            }
        }
        return xau;

    }

    public void removeStudent(String id)
    {
        for(int i=0;i<100;i++)
        {
            if(students[i]!=null &&students[i].getId().equals(id))
            {
                for(int j=i;j<99;j++) {
                    students[j] =students[j + 1];

                }
                students[size-1]=null;
                size--;
                break;
            }
        }
    }


}
