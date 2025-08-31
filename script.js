window.onload = function () {
    fetch('students.xml')
      .then(response => response.text())
      .then(data => {
        const parser = new DOMParser();
        const xml = parser.parseFromString(data, "application/xml");
        const students = xml.getElementsByTagName("student");
  
        let output = "<ul>";
        for (let i = 0; i < students.length; i++) {
          let name = students[i].getElementsByTagName("name")[0].textContent;
          let subject = students[i].getElementsByTagName("subject")[0].textContent;
          let marks = students[i].getElementsByTagName("marks")[0].textContent;
          output += `<li><strong>${name}</strong> - ${subject} - Marks: ${marks}</li>`;
        }
        output += "</ul>";
  
        document.getElementById("studentData").innerHTML = output;
      });
  }