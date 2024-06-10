package com.example.interiordesign;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class InteriorProductServiceImpl implements InteriorProductService {
    @Override
    public List<InteriorProduct> getAllProducts() {
        List<InteriorProduct> products = new ArrayList<>();
        products.add(new InteriorProduct("Corporate Office Painting Works", "Type of Property Covered: Commercial, Location Preference: Tamil Nadu, Type of Services Available: Regular Painting, Wall Mounted: Yes", "Rs 20 / Square Feet"));
        products.add(new InteriorProduct("Interior Designer Wall Painting", "Service Location: Chennai, Application: Office, home and etc, Finish: Smooth, Thickness: 1-2 mm, Wall Mount: Yes", "Price on Request"));
        products.add(new InteriorProduct("Modern Office Furniture", "Material: Wood, Style: Modern, Type: Modular, Shape: Rectangular, Country of Origin: Made in India", "Rs 8,000 / Piece"));
        products.add(new InteriorProduct("Modular Office Cabin Furniture", "Material: Plywood, Color: Any color, Shape: L, Usage/Application: Office and Commercial", "Rs 15,000 / Piece"));
        products.add(new InteriorProduct("Oval Shape Conference Tables", "Seating Capacity: 8 Seater, Primary Material: Plywood, Storage: Without Storage, Shape: Rectangular", "Rs 36,000 / Piece"));
        products.add(new InteriorProduct("Office Workstation", "Layout Type: Cluster, Material: Wood, Built Type: Modular, Table Top Thickness: 3-5 mm", "Rs 6,900 / Unit"));
        products.add(new InteriorProduct("GLD-EX-20-05 Workstation Chair", "Seat Material: Fabric, Color: Black, Warranty: 6 Months, Height Adjustable: Yes", "Rs 2,850 / Piece"));
        products.add(new InteriorProduct("Office Cubicle Workstation", "Material: Wooden, Seating Capacity: 1 Seater, Deal In: New", "Price on Request"));
        return products;
    }
}
