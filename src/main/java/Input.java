import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Input {

  private int rows, cols, numDrones, numTurns, payload, numProductTypes, numWarehouses, x, y, numOrders, numOrderedItems = 0;
  private ArrayList<Product> products = new ArrayList<Product>();
  private ArrayList<Warehouse> warehouses = new ArrayList<Warehouse>();
  private ArrayList<Order> orders = new ArrayList<Order>();


  public void getData(String path) throws IOException {

    File file = new File(path);
    BufferedReader br = new BufferedReader(new FileReader(file));
    String line = br.readLine();
    String[] values = line.split(" ");
    this.rows = Integer.parseInt(values[0]);
    this.cols = Integer.parseInt(values[1]);
    this.numDrones = Integer.parseInt(values[2]);
    this.numTurns = Integer.parseInt(values[3]);
    this.payload = Integer.parseInt(values[4]);

    // Products
    line = br.readLine();
    this.numProductTypes = Integer.parseInt(line);

    line = br.readLine();
    values = line.split(" ");
    for (int i = 0; i < numProductTypes; i++)
      products.add(new Product(i, Integer.parseInt(values[i])));

    for (Product p : products)
      System.out.println(p);

    // Warehouses
    line = br.readLine();
    this.numWarehouses = Integer.parseInt(line);

    for (int k = 0; k < numWarehouses; k++) {
      line = br.readLine();
      String[] coords = line.split(" ");
      this.x = Integer.parseInt(coords[0]);
      this.y = Integer.parseInt(coords[1]);

      line = br.readLine();
      values = line.split(" ");
      HashMap<Integer, Integer> stock = new HashMap<Integer, Integer>();
      for (int j = 0; j < numProductTypes; j++)
        stock.put(j, Integer.parseInt(values[j]));

      warehouses.add(new Warehouse(x, y, k, stock));

    }

    for (Warehouse w : warehouses)
      System.out.println(w);

    // Orders
    line = br.readLine();
    this.numOrders = Integer.parseInt(line);

    for (int l = 0; l < numOrders; l++) {
      line = br.readLine();
      String[] coords = line.split(" ");
      this.x = Integer.parseInt(coords[0]);
      this.y = Integer.parseInt(coords[1]);

      line = br.readLine();
      this.numOrderedItems = Integer.parseInt(line);

      line = br.readLine();
      String[] products = line.split(" ");

      HashMap<Integer, Integer> items = counter(products);
      orders.add(new Order(x, y, l, items));
    }

    System.out.println(orders);

    br.close();
  }

  private HashMap<Integer, Integer> counter(String[] list) {
    HashMap<Integer, Integer> items = new HashMap<Integer, Integer>();
    int i = 0;
    while (i < list.length) {
      int count = 1;
      if (!isPresent(Integer.parseInt(list[i]), items)) {
        for (int k = i + 1; k < list.length; k++) {
          if (Integer.parseInt(list[i]) == Integer.parseInt(list[k]))
            count++;
        }
        items.put(Integer.parseInt(list[i]), count);
      }
      i++;
    }
    return items;
  }

  private boolean isPresent(int num, HashMap<Integer, Integer> hm) {
    boolean found = false;
    for (Integer i : hm.keySet())
      if (num == i)
        found = true;
    return found;
  }

  public static void main(String[] args) throws IOException {
    Input i = new Input();
    i.getData("datasets/example.in");
  }


}
