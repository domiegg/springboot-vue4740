const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot10h6b/",
            name: "springboot10h6b",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot10h6b/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "一起来约苗系统"
        } 
    }
}
export default base
