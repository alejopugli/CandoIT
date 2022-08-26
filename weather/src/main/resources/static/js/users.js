$(document).ready(function () {
    loadUsers();
  });
  
  async function loadUsers() {
    const request = await fetch("api/get_users", {
      method: "GET",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
    });
    const users = await request.json();
  
    let usersList = "";
    for (let user of users) {
      let userRow =
        "<tr><td>" + user.name + "</td><td>" + user.rol + "</td></tr>";
      usersList += cityRow;
    }
    
    document.querySelector("#Ciudades tbody").outerHTML = usersList;
  }
  