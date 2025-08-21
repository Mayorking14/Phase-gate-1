

def show_menu():
    print("""
    Welcome to your grocery shopping! Choose from the options below:

        1. Add item
        2. Remove item
        3. Show all items
        0. Exit
    """)


item_list = []

def add_item(item):
    item_list.append(item)
    return "item added succesfully"

def remove_item(item):
    if item in item_list:
        item_list.remove(item)
        return "item removed  successfully"
    else:
        return "Item not found"

def show_all_items():
    return item_list

def exit():
    return False




def main():
    running = True
    while running:
        show_menu()
        choice = input("What would you like to do: ")

        if choice == "1":
            item = input("Enter item to add: ")
            print(add_item(item))

        elif choice == "2":
            item = input("Enter item to remove: ")
            print(remove_item(item))

        elif choice == "3":
            print(show_all_items())

        elif choice == "0":
            running = exit()

        else:
            print("Invalid choice! Try again.")

    
main()