package ECommerce.UI;

import java.util.List;

import ECommerce.model.Category;

public interface CategoryUI {
	
	

	public boolean addCategory(Category category);
	public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);
	
	public List<Category> listCategories();
	public Category getcategory(int categoryId);
}
