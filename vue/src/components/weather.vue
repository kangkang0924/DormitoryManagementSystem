<template>
  <div id="he-plugin-standard"></div>
</template>

<script>
export default {
  name: "weather",
  created() {
    //和风天气插件调用
    window.WIDGET = {
      "CONFIG": {
        "layout": "1",
        "width": "380",
        "height": "150",
        "background": "1",
        "dataColor": "FFFFFF",
        "borderRadius": "5",
        "city": "CN101070407",
        "key": "3295e162efe34934a9633454c869a59b"
      }
    };
    (function (d) {
      var c = d.createElement('link')
      c.rel = 'stylesheet'
      c.href = 'https://widget.heweather.net/standard/static/css/he-standard.css?v=1.4.0'
      var s = d.createElement('script')
      s.src = 'https://widget.heweather.net/standard/static/js/he-standard.js?v=1.4.0'
      var sn = d.getElementsByTagName('script')[0]
      sn.parentNode.insertBefore(c, sn)
      sn.parentNode.insertBefore(s, sn)
    })(document)
  },
}
</script>

<style scoped>

</style>