function addToList() {
  let textInput = document.getElementById("quantumText");
  let textNumber = document.getElementById("quantumNumber");
  let textList = document.getElementById("textList");

  if (textInput.value === "" || textNumber.value === "") {
    alert("One of the fiels is empty");
  } else {
    let newItem = document.createElement("li");
    newItem.textContent = textInput.value;
    textList.appendChild(newItem);
    textInput.value = "";

    let newItem2 = document.createElement("li");
    newItem2.textContent = textNumber.value;
    textList.appendChild(newItem2);
    textNumber.value = "";
  }
}
function addTimeQuantum() {
  let quantumNumber = document.getElementById("quantumFinalNumber");
  if (quantumNumber.value === "") {
    alert("You have to put quantum number");
  }
  if (quantumNumber.value <= 0) {
    alert("You have to put a number higher than cero");
  }
  quantumNumber.value = "";
}
