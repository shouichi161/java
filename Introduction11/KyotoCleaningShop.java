public class KyotoCleaningShop implements CleaningService {
  String ownerName;
  String address;
  String phone;
  //シャツを洗う
  public shirt washShirt(Shirt s) {
    //大型洗濯機１５分
    return s;
  }
  //タオルを洗う
  public Towl washTowl(Towl t) {
    //大型洗濯機１０分
    return t;
  }
  //コートを洗う
  public Coat washCort(Cort c) {
    //ドライ２０分
    return c;
  }
}
