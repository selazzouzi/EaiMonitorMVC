<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Left side column. contains the logo and sidebar -->

 <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="<c:url value="/resources/dist/img/avatar5.png"/>" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>${username}</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        <li class="active treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>Dashboard</span> <i class="fa fa-angle-left pull-right"></i>
          </a>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-shopping-cart"></i>
            <span>Orders</span>
            <span class="label label-primary pull-right">4</span>
          </a>
          <ul class="treeview-menu">
            <li><a href="<c:url value="/orders.html" />"><i class="fa fa-history"></i>Orders Overview</a></li>
            <li><a href="<c:url value="/order_history.html" />"><i class="fa fa-history"></i>Order History</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-tasks"></i>
            <span>Jobs</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="jobs.html"><i class="fa fa-circle-o"></i>Jobs Overview</a></li>
          </ul>
        </li>
        <li>
          <a href="#">
            <i class="fa fa-user"></i> <span>Customers</span>
            <small class="label pull-right bg-green">new</small>
          </a>
        </li>
        <li>
          <a href="<c:url value="/projects.html" />">
          	<i class="fa fa-laptop"></i>
            <i class="fa fa-angle-left pull-right"></i> <span>Projects</span>
          </a>
        </li>
        <li>
         <a href="<c:url value="/timesheets.html"/>">
          	<i class="fa fa-calendar"></i>
            <i class="fa fa-angle-left pull-right"></i> <span>Timesheets</span>
          </a>
        </li>
        <li>
         <a href="<c:url value="/planning.html" />">
          	<i class="glyphicon glyphicon-time"></i>
            <i class="fa fa-angle-left pull-right"></i> <span>Planning</span>
          </a>
        </li>
        <li class="treeview">
          <a href="<c:url value="/logging.html" />">
            <i class="fa fa-laptop"></i>
            <span>Logging</span>
          </a>
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>
