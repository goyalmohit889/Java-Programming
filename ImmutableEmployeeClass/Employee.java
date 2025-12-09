package ImmutableEmployeeClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Employee {
    private final int id;
    private final String name;
    private final List<String> skills;

    public Employee(int id , String name , List<String> skills){
        this.id = id;
        this.name = name;

        if(skills == null){
            this.skills = Collections.emptyList();
        }
        else{
            this.skills = Collections.unmodifiableList(new ArrayList<>(skills));
        }
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<String> getSkills(){
        return skills;
    }

    @Override
    public String toString(){
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", skills=" + skills +
                    '}';
        }
    }


