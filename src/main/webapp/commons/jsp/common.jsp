function toggleFrame() {
  var showDis = $("#mainShow").css("display");
  var operationDis = $("#mainlayout").css("display");
  $("#mainShow").css("display", showDis == "inline" ? "none" : "inline");
  $("#mainlayout").css("display", operationDis == "inline" ? "none" : "inline");
  if (showDis == "inline") {
    $("#mainShow").before($("#mainlayout"));
  } else {
    $("#mainlayout").before($("#mainShow"));
  }

  console.info("showDis: " + showDis);
  console.info("operationDis: " + operationDis);
};
$(function() {
  var ctxPath = "${pageContext.request.contextPath }";
  $("#mainBtn1").click(function() {
    $("#mainShow").toggle();
    $("#mainlayout").toggle();
  });

  function toggleFrame() {
    var showDis = $("#mainShow").css("display");
    var operationDis = $("#mainlayout").css("display");
    $("#mainShow").css("display", showDis == "inline" ? "none" : "inline");
    $("#mainlayout").css("display",
        operationDis == "inline" ? "none" : "inline");
    if (showDis == "inline") {
      $("#mainShow").before($("#mainlayout"));
    } else {
      $("#mainlayout").before($("#mainShow"));
    }

    console.info("showDis: " + showDis);
    console.info("operationDis: " + operationDis);
  }

  $("#mainBtn2").click(function() {
    console.info("toggleFrame");
    toggleFrame();
  });
  $("#mainBtn3").click(function() {
    console.info("test");
  });
  $("ul#testBtn6Menu a").click(function(e) {
    var title = $(this).text();
    var href = $(this).data("href");
    var iframe = $(window.frames["mainlayout"].document)[0];
    var tabs = $(iframe).find('#operationCenterTabs')[0];
    var input = $(iframe).find('#operationInput')[0];
    // $(input).data("title", title);
    // $(input).data("href", href);
    input.name = title;
    $(input).val(href);
    $(input).click();
    e.preventDefault();
  });
  $("a[data-href]").click(function(e) {
    var title = $(this).text();
    var href = $(this).data("href");
    var iframe = $(window.frames["mainlayout"].document)[0];
    var tabs = $(iframe).find('#operationCenterTabs')[0];
    var input = $(iframe).find('#operationInput')[0];
    // $(input).data("title", title);
    // $(input).data("href", href);
    input.name = title;
    $(input).val(href);
    $(input).click();
    e.preventDefault();
  });

})
