
let itemList = [];

function addItem(item) {
  itemList.push(item);
  return "item added successfully";
}

function removeItem(item) {
  let index = itemList.indexOf(item);
  if (index !== -1) {
    itemList.splice(index, 1);
    return "item removed successfully";
  } else {
    return "Item not found";
  }
}

function displayAllItems() {
  return itemList;
}

function main() {
  let running = true;

  while (running) {
const prompt = require('prompt-sync')();

    let choice = prompt(`
    Welcome to your grocery shopping! Choose from the options below:

        1. Add item
        2. Remove item
        3. Show all items
        0. Exit

    What would you like to do?
    `);

    switch (choice) {
      case "1":
        let itemToAdd = prompt("Enter item to add:");
        console.log(addItem(itemToAdd));
        break;

      case "2":
        let itemToRemove = prompt("Enter item to remove:");
        console.log(removeItem(itemToRemove));
        break;

      case "3":
        console.log("Items: " + displayAllItems().join(" "));
        break;

      case "0":
        running = false;
        console.log("Goodbye! Thanks for choosing us");
        break;

      default:
        console.log("Invalid choice! Try again.");
    }
  }
}
main()
