
var projectName = '一起来约苗系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '疫苗信息',
	url: './pages/yimiaoxinxi/list.html'
}, 
{
	name: '健康科普',
	url: './pages/jiankangkepu/list.html'
}, 

{
	name: '疫苗资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot10h6b/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"疫苗信息","menuJump":"列表","tableName":"yimiaoxinxi"}],"menu":"疫苗信息管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"疫苗种类","menuJump":"列表","tableName":"yimiaozhonglei"}],"menu":"疫苗种类管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","修改","删除","审核","报表","提醒","接种"],"menu":"接种预约","menuJump":"列表","tableName":"jiezhongyuyue"}],"menu":"接种预约管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"提醒信息","menuJump":"列表","tableName":"tixingxinxi"}],"menu":"提醒信息管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除","查看评论"],"menu":"健康科普","menuJump":"列表","tableName":"jiankangkepu"}],"menu":"健康科普管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除"],"menu":"接种记录","menuJump":"列表","tableName":"jiezhongjilu"}],"menu":"接种记录管理"},{"child":[{"appFrontIcon":"cuIcon-service","buttons":["查看","修改","删除"],"menu":"咨询服务","tableName":"chat"},{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"疫苗资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","预约"],"menu":"疫苗信息列表","menuJump":"列表","tableName":"yimiaoxinxi"}],"menu":"疫苗信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"健康科普列表","menuJump":"列表","tableName":"jiankangkepu"}],"menu":"健康科普模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除"],"menu":"接种预约","menuJump":"列表","tableName":"jiezhongyuyue"}],"menu":"接种预约管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"提醒信息","menuJump":"列表","tableName":"tixingxinxi"}],"menu":"提醒信息管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看"],"menu":"接种记录","menuJump":"列表","tableName":"jiezhongjilu"}],"menu":"接种记录管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","预约"],"menu":"疫苗信息列表","menuJump":"列表","tableName":"yimiaoxinxi"}],"menu":"疫苗信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"健康科普列表","menuJump":"列表","tableName":"jiankangkepu"}],"menu":"健康科普模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
