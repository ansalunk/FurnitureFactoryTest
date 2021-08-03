package hackerrank;

import java.util.HashMap;


public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    
    private HashMap<Furniture, Integer> furnitureTest;
    
    
    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        furnitureTest = new HashMap<Furniture, Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        
        Integer countFurniture = 0;
        if(furnitureTest.containsKey(type)){
        
            count = furnitureTest.get(type);
        }
        
        furnitureTest.put(type, countFurniture+furnitureCount);
        
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {

        return new HashMap<Furniture, Integer>(furnitureTest);
    }

    public float getTotalOrderCost() {
       
        if(!furnitureTest.isEmpty()){
            
            return furnitureTest.entrySet().stream().map(f -> f.getKey().cost()*f.getValue()).collect(Collectors.toList()).stream().reduce(Float::sum).get();
        
            
        }
        
        return 0.0f;
    }

    public int getTypeCount(Furniture type) {
        
        if(furnitureTest.containsKey(type)){
        
            return furnitureTest.get(type);
            
        }
        return 0;
    }

    public float getTypeCost(Furniture type) {
        
        if(furnitureTest.containsKey(type)){
        
            return furnitureTest.get(type)*type.cost();
            
        }
        return 0.0f;
    }

    public int getTotalOrderQuantity() {
        
        if(!furnitureTest.isEmpty()){
        
            return furnitureTest.values().stream().reduce(Integer::sum).get();
        }
        
        return 0;
    }
}
