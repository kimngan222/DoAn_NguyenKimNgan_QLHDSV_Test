

package DTO;



public class infoDTO {
    private String infoID;
    private String infoName;
    private String infoSex;
    public void setInfoID(String id){
	this.infoID = id;
    }
    public void setInfoName(String name){
        this.infoName = name;
    }
    public void setInfoSex(String sex){
        this.infoSex = sex;
    }

    public String getInfoID() {
        return infoID;
    }

    public String getInfoName() {
        return infoName;
    }

    public String getInfoSex() {
        return infoSex;
    }
    
}
