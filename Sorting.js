function sortArrayDescending(arr) {
    const length = arr.length;

    for (let i = 0; i < length - 1; i++) {
        for (let j = 0; j < length - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {
                // Swap elements if they are in the wrong order
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

function takeUserInput() {
    const inputArray = [];
    const length = parseInt(prompt("Enter the number of elements:"));

    for (let i = 0; i < length; i++) {
        const element = parseInt(prompt(`Enter element ${i + 1}:`));
        inputArray.push(element);
    }

    return inputArray;
}

// Take user input for array elements
const userArray = takeUserInput();
console.log("Original Array:", userArray);

// Sort the array in descending order
const sortedArray = sortArrayDescending(userArray);
console.log("Array sorted in descending order:", sortedArray);

