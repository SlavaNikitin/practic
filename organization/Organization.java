package organization;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Organization {

    public static void main(String[] args) {
        Work work1 = new Work();
        Work work2 = new Work();
        Work work3 = new Work();
        Work work4 = new Work();
        Work work5 = new Work();
        List<Work> workList = new ArrayList<>();
        work1.setTitle("Driver");
        work2.setTitle("Economist");
        work3.setTitle("Technician");
        work4.setTitle("Engineer");
        work5.setTitle("Constructor");
        workList.add(work1);
        workList.add(work2);
        workList.add(work3);
        workList.add(work4);
        workList.add(work5);
        
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        Worker worker4 = new Worker();
        worker1.setFamily("Nikitin");
        worker1.setName("Vyacheslav");
        worker1.setSurname("Sergeevich");
        worker1.setBirthday("26.11.85");
        worker1.setWork(workList);
        worker2.setFamily("Savel'ev");
        worker2.setName("Victor");
        worker2.setSurname("Pavlovich");
        worker2.setBirthday("21.01.75");
        worker2.setWork(workList);
        worker3.setFamily("Mazaev");
        worker3.setName("Vladislav");
        worker3.setSurname("Ignat'evich");
        worker3.setBirthday("05.06.78");
        worker3.setWork(workList);
        worker4.setFamily("Veider");
        worker4.setName("Dart");
        worker4.setSurname("Porfir'evich");
        worker4.setBirthday("09.05.41");
        worker4.setWork(workList);
                
        Unit organization = new Unit();
        organization.setTitle("Организация");
        Unit management = new Unit();        
        Unit economicUnit = new Unit();
        economicUnit.setTitle("Экономический отдел");
        Unit constructorUnit = new Unit();
        constructorUnit.setTitle("Управление главного конструктора");
        
        List<Unit> children = new ArrayList<>();
        children.add(economicUnit);
        children.add(constructorUnit);
        
        Set<Worker> workerSet = new HashSet<>();
        workerSet.add(worker2);
        workerSet.add(worker1);
                
        management.setTitle("Management");
        management.setParent(organization);
        management.setChildren(children);
        management.setHead(worker4);
        management.setWorker(workerSet);
                
        System.out.println(management.toString());
    }
}