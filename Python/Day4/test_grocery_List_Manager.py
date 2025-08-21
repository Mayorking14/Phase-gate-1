import unittest
import grocery_List_Manager  

class TestGroceryListManager(unittest.TestCase):

    
    def test_add_item(self):
        result = grocery_List_Manager.add_item("milk")
        self.assertEqual(result, "item added successfully")

    def test_remove_item(self):
        grocery_List_Manager.add_item("bread")
        result = grocery_List_Manager.remove_item("bread")
        self.assertEqual(result, "item removed successfully")

    def test_remove_non_existing_item(self):
        result = grocery_List_Manager.remove_item("eggs")
        self.assertEqual(result, "Item not found")

    def test_display_all_items(self):
        grocery_List_Manager.add_item("apple")
        grocery_List_Manager.add_item("banana")
        result = grocery_List_Manager.display_all_items()
        self.assertEqual(result, ["apple", "banana"])

    def test_exit_program(self):
        self.assertFalse(grocery_List_Manager.exit_program())
