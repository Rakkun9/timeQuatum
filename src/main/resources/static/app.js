let list = [];
let quantumSendNumber = 0;

function addToList() {
    let textInput = document.getElementById("quantumText").value;
    let textNumber = document.getElementById("quantumNumber").value;
    let textList = document.getElementById("textList");

    if (textInput === "" || textNumber === "") {
        alert("One of the fields is empty");
    } else {
        let newItem = document.createElement("li");
        newItem.textContent = textInput;
        textList.appendChild(newItem);

        let newItem2 = document.createElement("li");
        newItem2.textContent = textNumber;
        textList.appendChild(newItem2);

        list.push(textInput);
        list.push(textNumber);
    }
}

function addTimeQuantum() {
    let quantumNumber = document.getElementById("quantumFinalNumber").value;

    if (quantumNumber === "") {
        alert("You have to put the quantum number");
    } else if (quantumNumber <= 0) {
        alert("You have to put a number greater than zero");
    } else {
        quantumSendNumber = quantumNumber;
    }
}

async function sendData() {
    const datos = {
        dato1: list,
        dato2: quantumSendNumber
    };

    const requst = await fetch('api/dataProcesada', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    })
        .then(response => response.json())
        .then(data => {
            console.log('Respuesta del servidor', data.message);
        })
        .catch(error => {
            console.error('Error:', error);
        });




}
