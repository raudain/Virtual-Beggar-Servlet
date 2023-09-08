/* 
 *	***************** Menu Section Header ****************
 */

// Create Worker Button
const rightButton = document.createElement("li");
rightButton.className = "w3-bar-item w3-margin-right w3-right w3-mobile";
const navigation = document.querySelector("ul");
const changeListButton = document.createElement("button");
changeListButton.type = "button";
if  (location.href == 'http://localhost:8080/BeggarOfficeJsp/Room')
    changeListButton.className = "w3-button w3-yellow w3-hover-red w3-round-large";
else
	changeListButton.className = "w3-button w3-hover-red w3-round-large";
rightButton.appendChild(changeListButton);
const icon = document.createElement("i");
icon.className = "fa-regular fa-plus";
changeListButton.appendChild(icon);
const buttonText = document.createTextNode("Update List");
changeListButton.addEventListener("click", changeListPage);
changeListButton.appendChild(buttonText);

/*
 * ***************** New Worker Onboarding ****************
 */
function changeListPage() {
	location.href="Room";
}
