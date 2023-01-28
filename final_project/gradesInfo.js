import showInsertPage from "../Grades/showInsertPage.js";
import showUpdatePage from "../Grades/showUpdatePage.js";
import doDelete from "../Grades/doDelete.js";
import Request from "../Request.js";

export default function GradesInfo() {
  Request()
    .get("/index.php?action=getGradess")
    .then((res) => {
      let response = res["data"];
      console.log(response);
      switch (response["status"]) {
        case 200:
          let rows = response["result"];
          rows.sort((a, b) => {
            return b.aver - a.aver;
          });
          let str = `<table border='1'>`;
          str += `<button id='newGrades'>新增成績</button></td></tr>`;

         rows.forEach((element) => {
            stack.push(`<tr><td id='id' align="center" colspan="4">` + element["stdid"] + `</td></tr>`);
            stack.push(`<td>科目</td><td>上學期成績</td><td>下學期成績</td><td>科目平均</td></tr>`);
            stack.push(`<tr>`);
            stack.push(`<tr>` + `<td>國文</td>` + `<td align="center">` + element["cnmid"] + `<td align="center">` + element["cnfin"] + `</td>` + `<td align="center">` + element["cna"] + `</td>`);
            stack.push(`<tr>` + `<td>英文</td>` + `<td align="center">` + element["enmid"] + `</td>` + `<td align="center">` + element["enfin"] + `</td>` + `<td align="center">` + element["ena"] + `</td>`);
            stack.push(`<tr>` + `<td>數學</td>` + `<td align="center">` + element["mamid"] + `</td>` + `<td align="center">` + element["mafin"] + `</td>` + `<td align="center">` + element["maa"] + `</td>`);
            stack.push(`<tr>` + `<td>平均成績</td>` + `<th align="center" colspan="4">` + element["aver"] + `</th>`);
            stack.push(`<td><button id='updateGrades'>修改</button><button id='deleteGrades'>刪除</button></td></tr>`);
            stack.push(`<tr>`);
            stack.push(`<tr>` + `<td>期末成果</td>`);

            if (element["cna"] < 60) {
              str += `<td>國文應重修</td>`;
            }
            if (element["ena"] < 60) {
              str += `<td>英文應重修</td>`;
            }
            if (element["maa"] < 60) {
              str += `<td>數學應重修</td>`;
            }
          });
          str += `</table>`;
          $("#content").html(str);

          $("#newGrades").click(function (e) {
            showInsertPage();
          });
          const updateButtons = $("button[id=updateGrades]");
          const deleteButtons = $("button[id=deleteGrades]");
          const ids = $("td[id=id]");
          updateButtons.click(function (e) {
            const idx = updateButtons.index($(this));
            showUpdatePage(ids[idx].innerText);
          });
          deleteButtons.click(function (e) {
            const idx = deleteButtons.index($(this));
            doDelete(ids[idx].innerText);
          });

          break;
        default:
          $("#content").html(response["message"]);
          break;
      }
    })
    .catch((err) => {
      console.error(err);
    });
}
