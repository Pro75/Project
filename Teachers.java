package Model;

public class Teachers {

    public int id;
    public String name,designation, email, cell, initial;

    public Teachers(int id, String name, String email, String cell, String initial) {
        this.id = id;
        this.name = name;
        this.cell = cell;
        this.email = email;
        this.initial = initial;
    }

    public Teachers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInitial() {
        return initial;
    }
    public String setInitial(){
        this.initial=initial;
        return null;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation( ) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
            this.name= this.name;
    }

    public String getCell() {
        return cell;
    }
    public void setCell(){
        this.cell=cell;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(){
        this.email=email;
    }



}