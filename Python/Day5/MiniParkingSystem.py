#display options of what to do to the user.
#save the user's response to allow them park their vehicle if there's still space in the parking lot and if there isn't, it would display "space not #available".
#also if the user wants to drive out, he would input the number of his car or the number position of where their car is parked.
#at each time when the lot ids full or free, it will always show the list of the parking lot.







def show_menu():
	print("""

	1. Add item
        2. Remove item
        3. Show all items
        0. Exit
    """)


parking_Space = []

def add_car(carNum):
    parking_Space.append(carNum)
    return "car parked succesfully"

def drive_out(car):
    if car in parking_Space:
        parking_Space.remove(car)
        return "car space available"
   
def show_all_parked_cars():
    return parking_Space

def exit():
    return False




def main():
    running = True
    while running:
        show_menu()
        choice = input("What would you like to do: ")

        if choice == "1":
            car_Number = input("Enter item to add: ")
            print(add_car(car_Number))

        elif choice == "2":
            drive_out = input("Enter item to remove: ")
            print(drive_out(drive_out))

        elif choice == "3":
            print(show_all_parked_cars())

        elif choice == "0":
            running = exit()

        else:
            print("Invalid choice! Try again.")

    
main()