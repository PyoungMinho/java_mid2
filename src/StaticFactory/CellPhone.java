package StaticFactory;

interface CellPhone {

    class Galaxy implements CellPhone {}
    class IPhone implements CellPhone {}
    class Huawei implements CellPhone {}

    public static CellPhone getGalaxyPhone(){
        return new Galaxy();
    }
    public static CellPhone getApplePhone(){
        return new IPhone();
    }
    public static CellPhone getHuaweiPhone(){
        return new Huawei();
    }
}