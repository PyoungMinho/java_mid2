package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

  private Map<Product, Integer> cartMap = new HashMap<>();

  // code plz

  public void add(Product product, int addQuantity) {
    int quantity = cartMap.getOrDefault(product,0); // 카트에 넣은 품목 수량 디폴트 0으로 만들고
    cartMap.put(product, quantity + addQuantity); // 실제로 넣을때 품목,가격 + 실제 추가된 품목의수량
  }

  public void minus(Product product, int minusQuantity) {
    int existingQuantity = cartMap.getOrDefault(product, 0); // 현재수량
    int newQuantity = existingQuantity - minusQuantity; // 실제로 빼는 수량 빼서 수량 계산해주고

    if (newQuantity <= 0) {
      cartMap.remove(product);
    } else {
      cartMap.put(product, newQuantity);
    }
  }

  public void printAll() {
    System.out.println("==모든 상품 출력==");
    for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
      System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
    }
  }

}
